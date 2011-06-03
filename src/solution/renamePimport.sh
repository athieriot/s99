#!/bin/zsh

find src/solution -name "*.scala" -exec zsh -c "sed 's/P\([0-9].\)/Problem\\1Solution/' < '{}' > '{}.1'" \;
find src/solution -name "*.scala" -exec zsh -c "mv '{}'.1 '{}'" \;

find src/solution -name "*.scala" -exec zsh -c "sed 's/import \(Problem[0-9].Solution\)/import \\1\.\\1/' < '{}' > '{}.1'" \;
find src/solution -name "*.scala" -exec zsh -c "mv '{}'.1 '{}'" \;
