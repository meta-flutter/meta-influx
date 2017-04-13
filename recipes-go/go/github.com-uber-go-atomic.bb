DESCRIPTION = "github.com/uber-go/atomic"

GO_IMPORT = "github.com/uber-go/atomic"

inherit go

SRC_URI = "git://github.com/uber-go/atomic;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "74ca5ec650841aee9f289dce76e928313a37cbc6"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=1caee86519456feda989f8a838102b50"

FILES_${PN} += "${GOBIN_FINAL}/*"

do_install_append_class-target() {
    find "${D}${GOROOT_FINAL}" \( -name \*.sh -o -name \*.bash \) -delete
}
