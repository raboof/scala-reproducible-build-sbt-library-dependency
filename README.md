This is a small test project to try out how removing timestamps from inside
jars affects various build tools.

It contains 2 completely separate SBT projects which depend on each other.

Making changes to one should correctly trigger recompilation of the other, even
when using incremental builds.

Future work:
* make 'removing the timestamps' (and other reproducible-builds features) a nice SBT 
plugin and/or submit changes to SBT/zinc itself where reasonable.
* turn this into an automated test suite
* test with other builds systems
