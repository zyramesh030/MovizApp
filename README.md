<h1>Moviz App - Real-Time Popular Movies Fetcher</h1>

<h2>Description</h2>
<h5>The Movie App is an Android application that allows users to explore the latest popular movies. It fetches real-time data from the TMDB (The Movie Database) API to display trending movies using Jetpack Compose and the LazyColumn (RecyclerView) for smooth, scrollable lists. The app offers a modern user interface with an efficient, responsive design, delivering the most up-to-date information on popular movies.</h5>

<h2>Features:</h2>
<li><b>Real-Time Updates</b>: Fetches the latest popular movie data from TMDB API in real time.</li>
<li><b>Offline Access</b>: Utilizes ROOM Database to store fetched movie data locally, enabling users to view the list of popular movies even when offline.</li>
<li><b>Smooth UI</b>: Implements Jetpack Compose for a modern, declarative UI with real-time data rendering.</li>
<li><b>LazyColumn</b>: Efficiently displays the list of movies using LazyColumn (RecyclerView), making it memory and performance optimized.</li>
<li><b>Movie Details</b>: Displays essential movie details such as title, poster image, and overview.</li>

<h2>Tech Stack</h2>
<li><b>Jetpack Compose</b>: For building the UI with declarative syntax.</li>
<li><b>Retrofit</b>: For API calls and data fetching from TMDB.</li>
<li><b>Coroutines</b>: To handle asynchronous tasks for API calls and updating the UI in real-time.</li>
<li><b>TMDB API</b>: To fetch trending and popular movie data.</li>

<h2>Setup</h2>
<ol>
  <li>Clone or download the project to your local machine.</li>
  <li>Open the project in <b>Android Studio</b>.</li>
  <li>Add your TMDB API key to the <b>strings.xml</b> file under the <b>res/values</b> folder.</li>
  <li>Make sure to set up your local ROOM database in the MoviesDB class.</li>
  <li>Build the project and run it on an emulator or physical device.</li>
</ol>

<h2>Screenshots</h2>
[Screenshot_20250212_222159](https://github.com/user-attachments/assets/1ec6bbf9-885a-430a-806b-0aeb5b6c1b34)


