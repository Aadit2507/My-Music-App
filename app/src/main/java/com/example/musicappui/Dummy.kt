package com.example.musicappui

annotation class DrawableRes

data class Lib(@DrawableRes val icon : Int , val name : String )

    val libraries = listOf<Lib>(
        Lib(R.drawable.ic_playlist_green ,"Playlists"),
        Lib(R.drawable.ic_microphone ,"Artists"),
        Lib(R.drawable.ic_baseline_album_24 ,"Albums"),
        Lib(R.drawable.ic_baseline_music_note_24 ,"Songs"),
        Lib(R.drawable.ic_genre,"Genre")

    )


