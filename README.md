#Muffle Socket Server
<details><summary>Config file</summary>
<p>

```properties
# ===== DATABASE =====
db.driver = derby
db.host = localhost
db.port = 1527
db.dbName = ''
db.username = ''
db.password = ''
# ===== SERVER =====
server.host = localhost
server.port = 8025
server.rootPath = /muffle
```

</p>
</details>

##Requests
<details><summary>Default-Request</summary>
<p>

```JSON
{"type":  ""}
```

</p>
</details>
<details><summary>Auth-Request</summary>
<p>

```JSON
{"type":  "auth", "token":  ""}
```

</p>
</details>

<details><summary>Playlist-Requests</summary>
<br><br> Add Song
<p>

```JSON
{"type":  "addSongToPlaylist", "songID":  0, "playlistID":  0, "mufflerID":  0}
```

</p>
Remove Song
<p>

```JSON
{"type":  "removeSongFromPlaylist", "playlistID":  0, "songID":  0}
```

</p>
Invite Muffler
<p>

```JSON
{"type":  ""}
```

</p>
</details>
<details><summary>Session-Requests</summary>
<br><br> Add Song
<p>

```JSON
{"type":  "addSongToPlaylist", "songID":  0, "playlistID":  0, "mufflerID":  0}
```

</p>
Remove Song
<p>

```JSON
{"type":  "removeSongFromPlaylist", "playlistID":  0, "songID":  0}
```

</p>
Invite Muffler
<p>

```JSON
{"type":  ""}
```

</p>
</details>