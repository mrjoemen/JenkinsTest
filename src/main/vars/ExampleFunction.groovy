def buildApp() {
    echo "Jenkins Build #${BUILD_ID}"
    echo "Version ${params.VERSION}"
}

// The below line is needed to export all of the functions

return this