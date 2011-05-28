#!/bin/sh

for i in {01..99}
do
   if [[ "$i" =~ ^[0-9]$ ]]; then
      number=0$i
   else
      number=$i
   fi
   
   wget http://aperiodic.net/phil/scala/s-99/p$number.scala -O Problem$number\Solution.scala
done

find . -size 0k -exec rm {} \;
