DESCRIPTION = "github.com/cenkalti/backoff"

GO_IMPORT = "github.com/cenkalti/backoff"

inherit go

SRC_URI = "git://github.com/cenkalti/backoff;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "b02f2bbce11d7ea6b97f282ef1771b0fe2f65ef3" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=1571d94433e3f3aa05267efd4dbea68b"

FILES:${PN} += "${GOBIN_FINAL}/*"
