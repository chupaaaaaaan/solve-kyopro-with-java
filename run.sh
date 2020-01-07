#!/bin/sh

CLASS=$1

cd $(dirname $0)
java -cp target/classes/ chupaaaaaaan.${CLASS}
