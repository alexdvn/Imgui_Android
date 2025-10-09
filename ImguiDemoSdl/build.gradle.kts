android {
    // set the build tools version
    buildToolsVersion = "35.0.0"
    
    externalNativeBuild {
        cmake {
            path("src/main/cpp/CMakeLists.txt")
            // If your cmake version >= 3.21, you must specify a version
            // 3.18.5+ or 3.25.1 and so on
            version = "3.25.1"
        }
    }
}
