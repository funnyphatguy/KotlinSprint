package org.example.lesson_22

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false
)

class MainScreenModel() {

    var mainScreenState: MainScreenState = MainScreenState()

    val newState = mainScreenState

    fun loadData(newState: MainScreenState) {

        mainScreenState = newState
        mainScreenState = newState.copy(isLoading = true)
        mainScreenState = newState.copy(data = "Data", isLoading = true)

    }

}








