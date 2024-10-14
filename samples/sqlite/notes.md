# SQL notes

Use SQLite
- Already installed in fedora
- Remember: .exit, .help

Any downloadable example DBs?
- Standard is the "chinook" database
- [https://github.com/lerocha/chinook-database]
  - Download the DB file from ChinookDatabase/DataSources/Chinook_Sqlite.sqlite

Create a database from DDL:
`sqlite3 db_file.sqlite < ddl_file.sql`

Import data from CSV:
`sqlite> .mode csv`
`sqlite>.import c:/sqlite/city.csv cities`

Note: CSV with header will import header as data if the DDL has already created teh table.

If no table exists, it will create it from CSV headers.

Best to avoid altering tables in sqlite, it doesn't do them well

