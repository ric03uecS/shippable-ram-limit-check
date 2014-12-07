#!/usr/bin/env bash

if [ -f Main.class ]; then
	echo "Deleting Main.class"
	rm Main.class
fi

echo "Compiling with: "
echo `javac -version`

javac Main.java