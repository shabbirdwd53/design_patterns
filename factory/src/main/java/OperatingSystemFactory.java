import factories.LinuxOperatingSystem;
import factories.OperatingSystem;
import factories.WindowsOperatingSysten;

/**
 * Factory : As name suggest it is factory where we can create objects.
 * Since it creates object it falls in creational design pattern
 * Factory pattern has  two important element in its design.
 *
 * 1. Interface/Abstract class : This is base element for which we are making factory i.e we are going to get object of this type
 * In this case it is "OperatingSystem" which has type available Windows and Linux.
 *
 * 2. Factory : This will have nothing but Object creation logic. Lets say as a library you introduce one more subtype that is
 * MacOperationgSyetem. Now your caller is automatically extended this facility of third type , also we have taken responsiblity og
 * creating of object.
 *
 * In java this pattern is heavily used:
 * 1. Calendar.getInstance : Calendar is abstract class amd based on Locale and Timewzone we provided it is giving calendar instance.
 * Note in this case we really dont know what type of calendar we gott.
 * 2. In reflection Class.Forname : the type of class you pass it gets loaded.
 *
 * Best link to learn java and patterns used : https://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries
 */
public class OperatingSystemFactory {

    private OperatingSystemFactory() {

    }
/*
// One more advantage , tomorrow you planned to change OS here , you can simply change this and everything works as is.

Example creation of object.
OperatingSystem operatingSystem = OperatingSystemFactory.getInstance("WINDOWS" , "WIN7" ,"x64");
OperatingSystem operatingSystem2 = OperatingSystemFactory.getInstance("LINUX" , "DEB" ,"x64");
 */
    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type){
            case "WINDOWS":
                return new WindowsOperatingSysten(version,architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version,architecture);
            default:
                throw new IllegalArgumentException("OS Not supported");
        }
    }
}
