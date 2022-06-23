package disneyapp.com

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import disneyapp.com.databinding.CharacterBinding

class CharacterListAdapter : RecyclerView.Adapter<CharacterListAdapter.CharacterInfoHolder>() {
    val characterList = ArrayList<Character>()

    class CharacterInfoHolder(item: View) : RecyclerView.ViewHolder(item) {
        val characterBinding = CharacterBinding.bind(item)
        fun bind(character: Character) {
            characterBinding.characterAvatar.setImageResource(character.id)
            characterBinding.characterName.text = character.name

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterInfoHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character, parent, false)
        return CharacterInfoHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterInfoHolder, position: Int) {
        holder.bind(characterList[position])
    }

    override fun getItemCount(): Int {
        return characterList.size
    }
    fun addCharacter (character: Character){
        characterList.add(character)
        notifyDataSetChanged()
    }


}