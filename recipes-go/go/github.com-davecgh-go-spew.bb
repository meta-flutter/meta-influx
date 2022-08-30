DESCRIPTION = "github.com/davecgh/go-spew"

GO_IMPORT = "github.com/davecgh/go-spew"

inherit go

SRC_URI = "git://github.com/davecgh/go-spew;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "346938d642f2ec3594ed81d874461961cd0faa76"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=818c0a1d81cfcfdb7ecd58db268bab7e"

FILES:${PN} += "${GOBIN_FINAL}/*"
