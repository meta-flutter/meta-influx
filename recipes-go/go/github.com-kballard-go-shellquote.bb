DESCRIPTION = "github.com/kballard/go-shellquote"

GO_IMPORT = "github.com/kballard/go-shellquote"

inherit go

SRC_URI = "git://github.com/kballard/go-shellquote;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "d8ec1a69a250a17bb0e419c386eac1f3711dc142" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=9d95d1ad917c814c23909addb8692eeb"

FILES:${PN} += "${GOBIN_FINAL}/*"
