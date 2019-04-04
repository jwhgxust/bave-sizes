package cn.edu.gxust.jiweihuang.kotlin.util

import java.io.File
import java.io.IOException

/**
 * Provides sample code for getting paths that might be used to actual code in the future.
 *
 * Create date:2019-02-17.
 *
 * Last revision date:2019-02-18.
 *
 * @author Jiwei Huang
 * @since 1.0.0-build-20190217
 */
object Path {

    /**
     * Get the root path of class loading (this case is [Path]).
     */
    @JvmStatic
    val rootPathOfClassLoading: String = Path::class.java.getResource("/").path

    /**
     * Get the path of class loading (this case is [[Path]]).
     * It is different from [rootPathOfClassLoading],
     * the [pathOfClassLoading] includes package path of class.
     */
    @JvmStatic
    val pathOfClassLoading: String = Path::class.java.getResource("").path

}

/**
 * Get the root path of project.
 */
val pathOfproject: String
    get() {
        val directory = File("")
        lateinit var courseFile: String
        try {
            //An exception may be thrown by getCanonicalPath() method.
            //Here the exception is handled simply,so the program will be interrupted,if the exception does occur.
            courseFile = directory.canonicalPath
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return courseFile
    }

/**
 * Example case.
 */
fun main() {
    println("The root path of class loading:${Path.rootPathOfClassLoading}")
    println("The path of class loading:${Path.pathOfClassLoading}")
    println("The path of this project:$pathOfproject")
    // other methods
    println("The URL of class loading root path：${Path::class.java.classLoader.getResource("")}")
    println("The path of this projects:${System.getProperty("user.dir")}")
    println("The path of all class path (include jar):${System.getProperty("java.class.path")}")
}