package org.example.lesson_22

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false
)

class MainScreenModel() {

    var mainScreenState = MainScreenState()

    fun loadData() {

        mainScreenState = mainScreenState.copy(isLoading = true)
        mainScreenState = mainScreenState.copy(data = "Data", isLoading = true)

    }

}








