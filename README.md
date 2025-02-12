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
![Screenshot_20250212_222159](https://github.com/user-attachments/assets/4edf916a-face-40b8-b226-ff5cb9038082)
![Screenshot_20250212_222246](https://github.com/user-attachments/assets/5e5afc7e-963a-4325-be3b-b102e7de9a2b)

<h2>How it Works</h2>
<li>When the app is launched, it first tries to fetch the latest movie data from the TMDB API.</li>
<li>If the device is offline, it will retrieve the data stored in the local ROOM database and display it.</li>
<li>Once the device is back online, the app syncs with TMDB to fetch the most up-to-date movie nformation and stores it in the ROOM database for future offline access.</li>

<h2>Dependencies</h2>
<li>Jetpack Compose: For UI components</li>
<li>Retrofit: For API requests</li>
<li>Gson: For JSON parsing</li>
<li>Coil: For image loading (posters)</li>
<li>ROOM Database: For offline storage</li>
<li>Coroutines: For managing background tasks</li>

