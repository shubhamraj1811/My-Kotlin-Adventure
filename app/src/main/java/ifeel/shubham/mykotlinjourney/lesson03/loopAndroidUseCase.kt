package ifeel.shubham.mykotlinjourney.lesson03

fun main() {
    var isDataLoaded = false
    var retryCount = 0
    while(!isDataLoaded && retryCount < 5) {
        println("Fetching data... Attempt ${retryCount + 1}")
        retryCount++

        if (retryCount == 3) {
            isDataLoaded = true
        }
    }
    if (isDataLoaded) {
        println("Data Loaded Successfully! ✅")
    } else {
        println("Data Loading Failed! ❌")
    }
}