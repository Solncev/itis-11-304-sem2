plugins {
    id("java")
    id("application")
    id("war")
}

group = "com.solncev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass = "com.solncev.Main"
}

dependencies {
    implementation("org.springframework:spring-webmvc:6.2.3")
    implementation("jakarta.servlet:jakarta.servlet-api:6.1.0")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}