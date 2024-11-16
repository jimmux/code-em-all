# HomeBrew is surprisingly the most reliable package manager on images, 
#   but slow to install. Use the well maintained official image
FROM homebrew/brew

RUN sudo apt-get update; brew update

# Split up HomeBrew installs due to hitting the open file limit
# General utilities
RUN brew install \
    # Not great for global installs, useful for local
    asdf \
    exercism
# Languages and runtimes
RUN brew install \
    nodejs \
    purescript spago \
    typescript \
    java \
    elm \
    ghc haskell-stack
# Gleam depends on Erlang, which pulls in a lot
RUN brew install gleam
# Database
RUN brew install \
    sqlite

# JupyterLab is not available in HomeBrew for Linux, so use good old apt/pip
RUN sudo apt-get install -y python3 pip \
    && pip install jupyterlab
