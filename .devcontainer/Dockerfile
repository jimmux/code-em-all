# Safest sandbox available seems to be:
#   https://github.com/devcontainers/images/tree/main/src/universal
#   Already includes Python, Node, Java, and more
FROM mcr.microsoft.com/devcontainers/universal:linux

# Installations not covered by features

RUN apt-get update && apt-get install -y \
  # Haskell
  ghc
  
RUN npm install -g \
  # TS
  typescript \
  # PureScript
  purescript spago

# Add any shell customisations

# Set up samples

# Run verification
