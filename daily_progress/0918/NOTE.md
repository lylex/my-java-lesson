# Struct Convension

*    ${basedir}:			存放 pom.xml和所有的子目录
    
*    ${basedir}/src/main/java	项目的 java源代码
    
*    ${basedir}/src/main/resources	项目的资源，比如说 property文件
    
*    ${basedir}/src/test/java	项目的测试类，比如说 JUnit代码
    
*    ${basedir}/src/test/resources	测试使用的资源


# Create a project

    mvn archetype:generate -DgroupId=com.mycompany.helloworld -DartifactId=helloworld -Dpackage=com.mycompany.helloworld -Dversion=1.0-SNAPSHOT
    cd helloworld
    mvn package
    java -cp target/helloworld-1.0-SNAPSHOT.jar com.mycompany.helloworld.App


# Project Identifer

    groupId:artifactId:packaging:version



