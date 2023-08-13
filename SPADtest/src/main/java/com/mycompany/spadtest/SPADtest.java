Template inclusion failed (for parameter value "/Templates/Licenses/license-default.txt"):
Cannot find 'jar:file:/C:/SPAD%20PROJECT_CA/NetBeans-18/netbeans/ide/modules/org-netbeans-modules-projectui.jar!/org/netbeans/modules/project/ui/resources/license-default.txt'

----
FTL stack trace ("~" means nesting-related):
	- Failed at: #include "${project.licensePath}"  [in template "Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java" at line 4, column 1]
----
package com.mycompany.spadtest;

/**
 *
 * @author ACER
 */
public class SPADtest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
