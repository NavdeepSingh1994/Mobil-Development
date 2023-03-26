class `Movie Details` {
    @Composable
    fun MovieRow(movie: Movie) {
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
        ) {
            CoilImage(
                    data = movie.imageUrl,
                    contentDescription = movie.title,
                    modifier = Modifier.size(64.dp)
            )
            // ... Other movie info
        }
    }

}