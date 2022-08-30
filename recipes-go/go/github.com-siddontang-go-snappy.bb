DESCRIPTION = "github.com/siddontang/go-snappy"

GO_IMPORT = "github.com/siddontang/go-snappy"

inherit go

SRC_URI = "git://github.com/siddontang/go-snappy;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "d8f7bb82a96d89c1254e5a6c967134e1433c9ee2" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=b8b79c7d4cda128290b98c6a21f9aac6"

FILES:${PN} += "${GOBIN_FINAL}/*"

