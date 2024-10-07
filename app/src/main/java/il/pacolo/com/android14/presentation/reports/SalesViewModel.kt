package il.pacolo.com.android14.presentation.reports

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import il.pacolo.com.android14.model.Person


class SalesViewModel : ViewModel() {

    val itemList: MutableLiveData<List<Person>> = MutableLiveData()


    init {

        addPerson()
    }


    fun addPerson() {
        var currentList = itemList.value ?: emptyList()
        var updatedList = currentList.toMutableList().apply {
            add(Person("Frank"))
            add(Person("John"))
        }
        itemList.value = updatedList
    }
}

