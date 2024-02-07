package com.ttcn.model;

public class CategoryModel extends AbstractModel<CategoryModel> {
	private String tenDanhMuc;

	public String getTenDanhMuc() {
		return tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}

	@Override
	public String toString() {
		return "CategoryModel [tenDanhMuc=" + tenDanhMuc + ", getId()=" + getId() + ", getNgayTao()=" + getNgayTao()
				+ ", getNgaySua()=" + getNgaySua() + ", getNguoiTao()=" + getNguoiTao() + ", getNguoiSua()="
				+ getNguoiSua() + "]";
	}
	
}
