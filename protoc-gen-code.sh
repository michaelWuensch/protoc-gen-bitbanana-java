#!/bin/bash
java -cp build/libs/${PWD##*/}-all.jar app.michaelwuensch.bitbanana.protoc.ProtocPlugin "$@"