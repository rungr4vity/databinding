package il.pacolo.com.android14.presentation.reports

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import il.pacolo.com.android14.R
import il.pacolo.com.android14.adapters.PersonAdapter
import il.pacolo.com.android14.databinding.FragmentSalesBinding
import il.pacolo.com.android14.databinding.RowItemBinding
import il.pacolo.com.android14.model.Person


class SalesFragment : Fragment() {

    private lateinit var binding: FragmentSalesBinding
    //private lateinit var viewModel: SalesViewModel
    private lateinit var itemAdapter: PersonAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSalesBinding.inflate(inflater, container, false)
        setupRecyclerView()
        return binding.root

    }


    private fun setupRecyclerView() {
        val items = listOf(
            Person("Title 1"),
            Person("Title 2")

        )

        itemAdapter = PersonAdapter(items)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = itemAdapter
        }
    }


}