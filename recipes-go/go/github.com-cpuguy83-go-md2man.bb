DESCRIPTION = "github.com/cpuguy83/go-md2man/"

GO_IMPORT = "github.com/cpuguy83/go-md2man/"

inherit go

SRC_URI = "git://github.com/cpuguy83/go-md2man/;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "a65d4d2de4d5f7c74868dfa9b202a3c8be315aaa" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=80794f9009df723bbc6fe19234c9f517"

FILES:${PN} += "${GOBIN_FINAL}/*"
