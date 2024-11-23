package org.example.lesson_22

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false
)

class MainScreenModel() {

    var mainScreenState = MainScreenState()

    fun loadData() {

        mainScreenState = MainScreenState().copy()
        mainScreenState = MainScreenState().copy(isLoading = true)
        mainScreenState = MainScreenState().copy(data = "Data", isLoading = true)

    }

}








