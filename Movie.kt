class Movie {
    var expanded by remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxWidth()) {
        // ...
        Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable { expanded = !expanded }
        ) {
            Text(
                    text = "Details",
                    modifier = Modifier.weight(1f)
            )
            Icon(
                    if (expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                    contentDescription = if (expanded) "Collapse" else "Expand"
            )
        }
        AnimatedVisibility(
                visible = expanded,
                enter = slideInVertically(),
                exit = slideOutVertically()
        ) {
            // ... Details here
        }
    }
}