DESCRIPTION = "github.com/amir/raidman"

GO_IMPORT = "github.com/amir/raidman"

inherit go

SRC_URI = "git://github.com/amir/raidman;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "c74861fe6a7bb8ede0a010ce4485bdbb4fc4c985" 
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/UNLICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS += "\
    golang.org-x-net \
    github.com-golang-protobuf \
"