package com.example.mydevesstream.view
import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import  androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.mydevesstream.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.squareup.picasso.Picasso


class MovieDetailsActivity : AppCompatActivity() {

    private lateinit var textViewMovieTitle: TextView

    private lateinit var textViewMovieYear: TextView

    private lateinit var toolbar: Toolbar

    private lateinit var youTubePlayerView: YouTubePlayerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

          toolbar  = findViewById(R.id.toolbar)
         setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        toolbar.navigationIcon?.setTint(ContextCompat.getColor(this, R.color.white))
       supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_keyboard_arrow_down_24)

        textViewMovieTitle = findViewById(R.id.text_detailsmovieName)

        textViewMovieYear = findViewById(R.id.movie_detailstext_year)


        youTubePlayerView = findViewById(R.id.youtube_player_view)
        lifecycle.addObserver(youTubePlayerView)

        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {

            youTubePlayer.loadVideo("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4", 0f)

            }

            override fun onStateChange(
                youTubePlayer: YouTubePlayer,
                state: PlayerConstants.PlayerState
            ) {

                super.onStateChange(youTubePlayer, state)
            }
        })

    }

    // Handle back button click
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed() // Handle the back navigation
        return true
    }

    override fun onResume() {
        super.onResume()

        val bundle: Bundle? = intent.extras

        if (bundle != null) {

          ///movieImage =  bundle.getString("Poster").toString()

            textViewMovieTitle.text ="title: "+ bundle.getString("Title").toString()

            textViewMovieYear.text ="Year: "+ bundle.getString("Year").toString()

        }
    }
}