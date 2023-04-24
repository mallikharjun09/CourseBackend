package com.tmf.sms.sms_backend;

import com.tmf.sms.sms_backend.services.CourseServices;
import com.tmf.sms.sms_backend.services.ServiceImplementation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CourseServices service = new ServiceImplementation();
        service.menu();
    }
}
