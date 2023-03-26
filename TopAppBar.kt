import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopAppBar()
        }
    }
}

@Composable
fun TopAppBar() {
    var expanded by remember { mutableStateOf(false) }
    Column {
        TopAppBar(
                title = { Text(text = "MovieApp") },
                actions = {
                    IconButton(onClick = { expanded = !expanded }) {
                        Icon(Icons.Filled.ArrowDropDown, contentDescription = "Expand menu")
                    }
                },
                elevation = AppBarDefaults.TopAppBarElevation
        ) {
            DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(onClick = { /* Handle click */ }) {
                    Text("Favorites")
                }
            }
        }
    }
}