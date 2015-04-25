package com.chinnchilla.testmod.utility;


import com.chinnchilla.testmod.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper
{

    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
    }

    public static void off(Object object)
    {
        // Nothing will be logged
        log(Level.OFF, object);
    }

    public static void fatal(Object object)
    {
        // A severe error that will prevent the application from continuing
        log(Level.FATAL, object);
    }

    public static void error(Object object)
    {
        // An error in the application possibly recoverable
        log(Level.ERROR, object);
    }

    public static void warn(Object object)
    {
        // An event that might possibly lead to an error
        log(Level.WARN, object);
    }

    public static void info(Object object)
    {
        // An event for informative purposes
        log(Level.INFO, object);
    }

    public static void debug(Object object)
    {
        // A general debugging event
        log(Level.DEBUG, object);
    }

    public static void trace(Object object)
    {
        // A fine-grained debug message
        log(Level.TRACE, object);
    }

    public static void all(Object object)
    {
        // All events should be logged
        log(Level.ALL, object);
    }
}