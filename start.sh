#!/bin/bash

# Starts wildfly in standalone mode. need to add the log path here
# or it will fail.
$WF_HOME/bin/standalone.sh --properties=./jboss.properties -Djboss.server.log.dir=./server/log
