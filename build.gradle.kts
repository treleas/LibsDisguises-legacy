plugins {
    id("java")
}

group = "me.treleas"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://repo.dmulloy2.net/content/groups/public/")
}

dependencies {
    compileOnly("org.github.paperspigot:paperspigot-api:1.8.8-R0.1-SNAPSHOT")
    compileOnly("com.comphenix.protocol:ProtocolLib:4.8.0")
    compileOnly("com.mojang:authlib:2.3.31")

    compileOnly("com.google.guava:guava:31.1-jre")
    compileOnly("org.yaml:snakeyaml:1.30")
    compileOnly("commons-codec:commons-codec:1.15")
    compileOnly("commons-io:commons-io:2.11.0")
    compileOnly("org.apache.logging.log4j:log4j-core:2.17.2")

    testImplementation("junit:junit:4.13.2")
}

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(8)
    }
    javadoc { options.encoding = Charsets.UTF_8.name() }
    processResources { filteringCharset = Charsets.UTF_8.name() }
}