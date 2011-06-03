#!/bin/zsh

find src/solution -name "*.scala" -type f -exec zsh -c "echo package \`basename '{}' .scala\` > '{}'.1" \;
find src/solution -name "*.scala" -type f -exec zsh -c "echo '' >> '{}'.1" \;

find src/solution -name "*.scala" -type f -exec zsh -c "cp '{}' '{}'.2" \;

find src/solution -name "*.scala" -type f -exec zsh -c "cat '{}'.1 '{}'.2 > '{}'" \;

rm **/*.scala.1
rm **/*.scala.2
