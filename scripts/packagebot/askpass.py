#!/usr/bin/env python3
#
# Short & sweet script for use with git clone and fetch credentials.
# Requires GIT_USERNAME and GIT_PASSWORD environment variables,
# intended to be called by Git via GIT_ASKPASS.
#

from sys import argv
from os import environ

if "Username for " in argv[1]:
    print(environ.get('GIT_USERNAME', "No username available"))
    exit()
elif "Password for " in argv[1]:
    print(environ.get('GIT_PASSWORD', "Password is missing"))
    exit()

exit(1)