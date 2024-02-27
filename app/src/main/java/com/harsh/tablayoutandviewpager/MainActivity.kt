package com.harsh.tablayoutandviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.harsh.tablayoutandviewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var fragmentList = arrayListOf<Fragment>() // Updated: Changed variable name to fragmentList
    val titleList = listOf("Chats", "Updates", "Calls") // Updated: Changed titles
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        // Initialize fragments
        fragmentList.add(ChatsFragment())
        fragmentList.add(UpdatesFragment())
        fragmentList.add(CallsFragment())

        // Set ViewPager adapter
        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPager.adapter = TabAdapter(this, fragmentList)

        // Link TabLayout with ViewPager
        TabLayoutMediator(binding.tlTabLayout, binding.viewPager) { tab, position ->
            tab.text = titleList[position] // Set tab titles
        }.attach()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
      //  return super.onCreateOptionsMenu(menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_new_group -> {

                return true
            }
            R.id.menu_new_broadcast -> {

                return true
            }
            R.id.menu_linked_devices -> {

                return true
            }
            R.id.menu_starred_messages -> {

                return true
            }
            R.id.menu_payments -> {

                return true
            }
            R.id.menu_settings -> {

                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

}
class TabAdapter(fa: FragmentActivity, private val fragmentList: List<Fragment>) :
    FragmentStateAdapter(fa) {
    override fun getItemCount() = fragmentList.size

    override fun createFragment(position: Int) = fragmentList[position]
}