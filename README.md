## Joins Profiling
It is a simple project to test performance
of Lms-generated Join operations primitives
against their directly written versions.

Now there are two join ops for testing:
pairedInnerJoin and pairedOuterJoin both for LMS and Direct cases.

Tests can be run via main function in run.scala.
It accepts one parameter: max size of arrays as Int.
Test starts with size of 100 and increase it 10x times in a cycle.
As soon as new size exceeds given threshold, test stops.