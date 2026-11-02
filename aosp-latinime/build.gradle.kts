plugins {
    id("com.android.library")
}

android {
    namespace = "com.android.inputmethod.latin"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
    }

    sourceSets {
        getByName("main") {
            manifest.srcFile("src/main/AndroidManifest.xml")
            java.setSrcDirs(
                listOf(
                    rootProject.file("aosp/LatinIME/java/src"),
                    rootProject.file("aosp/LatinIME/common/src"),
                ),
            )
            res.setSrcDirs(listOf(rootProject.file("aosp/LatinIME/java/res")))
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
}
