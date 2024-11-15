# Code 'Em All

My personalised go-to dev container, that I can spin up whenever I need to just experiment or get things done.

Basing on the GitHub [universal image](https://github.com/devcontainers/images/tree/main/src/universal).

Currently supported:

- Node
  - Typescript
- Python
  - Jupyter
  - Pip
- Java
  - Gradle
- SQLite
- PureScript
- Elm
- Gleam

Extras to add over time:

- Maybe Yarn, Bun, and/or Deno
- Godot
  - "Godots" app mostly takes care of this
  - Might be useful for F# and other alternative experiments
- Haskell
- Postgres

Prefer everything at least current LTS versions, if not latest stable version.

Keep it friendly with VSCode Dev Containers, and (BoxBuddy or DevPod). I use this in Aurora atomic Linux, a host environment that requires minimal preparation.

Fedora base would have been preferred, for consistency with the host, but many dev container features aren't compatible.

## Samples

Small code samples to verify installation and configuration.

### Threlte

Verification of Vite and all that entails (node, port forwarding, unit test browsers, etc.).

```sh
$ cd samples/threlte
$ npm install
$ npm run dev
```

There are also the usual Vite extras, like unit tests. These may require Playwright setup:

```sh
$ npx playwright install-deps
$ npx playwright install
$ npm run test
```

### Python Notebook

Confirms notebooks, and by extension Python with PIP and others, is useable in VSCode.

Open `samples/notebook` in VSCode and run all.

### Java

Very simple Java project with Gradle.

```sh
$ cd samples/java
$ ./gradlew build
$ ./gradlew run
```

### SQLite

Because sometimes I need to do quick query experiments.

```sh
$ cd samples/sqlite
$ sqlite3
sqlite> .read schema.sql
sqlite> .import --csv --skip 1 users.csv users
sqlite> .import --csv --skip 1 categories.csv categories
sqlite> .import --csv --skip 1 topics.csv topics
sqlite> .import --csv --skip 1 posts.csv posts
sqlite> select username, content
  from posts
  inner join topics using (topic_id)
  inner join users using (user_id)
  inner join categories using (category_id)
  where category_name = 'Technology'
;
```

## To do

- Add more VSCode extensions and any required port configs to `devcontainer.json`
- Install any additional languages and/or frameworks via `devcontainer.json` features, `Dockerfile` and/or `postCreateCommand`
- Move threlte example to its own repo, and make it a subrepo of this, so it can have a built version online for viewing
- Use the tests that come with the universal image?
- Shell customisations, and other `.bashrc` tweaks
- Add more vscode extensions
- Add CI to actually run some of these verifications
- Move some of my additions to features
- [Badge](https://code.visualstudio.com/docs/devcontainers/create-dev-container#_add-an-open-in-dev-container-badge)
- More samples for available languages/frameworks
