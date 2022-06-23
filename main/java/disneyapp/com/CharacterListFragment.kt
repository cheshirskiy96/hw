package disneyapp.com


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import disneyapp.com.databinding.FragmentCharacterListBinding


class CharacterListFragment : Fragment() {
    private lateinit var binding: FragmentCharacterListBinding
    private val adapter = CharacterListAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCharacterListBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }


    companion object {

        @JvmStatic
        fun newInstance() = CharacterListFragment()
    }

    private fun init() {
        binding.apply {
            characterListRecyclerView.layoutManager =
                GridLayoutManager(requireContext(), 2)
            characterListRecyclerView.adapter =adapter
        }
    }


}