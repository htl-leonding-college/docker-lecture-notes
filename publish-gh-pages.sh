#!/bin/bash
# DO NOT USE
# OR RATHER READ IT AND THEN USE
# ONLY WORKS FROM THE PROJECT DIR
# WILL PUBLISH STUFF ON THE WEBSITE, DON'T SCREW UP
export old=${PWD}
${PWD}/build-html-docker.sh
exit 0
cd docs
git .
git commit -m "update Demo Website"
git push origin gh-pages
cd $old

