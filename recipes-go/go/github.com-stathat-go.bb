DESCRIPTION = "github.com/stathat/go"

GO_IMPORT = "github.com/stathat/go"

inherit go

SRC_URI = "git://github.com/stathat/go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "74669b9f388d9d788c97399a0824adbfee78400e" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=9b5c931572a8aa113ce83124dfbb7779"

FILES:${PN} += "${GOBIN_FINAL}/*"
