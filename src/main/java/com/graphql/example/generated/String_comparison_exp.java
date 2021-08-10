package com.graphql.example.generated;

/**
 * expression to compare columns of type String. All fields are combined with logical 'AND'.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class String_comparison_exp implements java.io.Serializable {

    private String _eq;
    private String _gt;
    private String _gte;
    private String _ilike;
    @javax.validation.constraints.NotNull
    private java.util.List<String> _in;
    private Boolean _is_null;
    private String _like;
    private String _lt;
    private String _lte;
    private String _neq;
    private String _nilike;
    @javax.validation.constraints.NotNull
    private java.util.List<String> _nin;
    private String _nlike;
    private String _nsimilar;
    private String _similar;

    public String_comparison_exp() {
    }

    public String_comparison_exp(String _eq, String _gt, String _gte, String _ilike, java.util.List<String> _in, Boolean _is_null, String _like, String _lt, String _lte, String _neq, String _nilike, java.util.List<String> _nin, String _nlike, String _nsimilar, String _similar) {
        this._eq = _eq;
        this._gt = _gt;
        this._gte = _gte;
        this._ilike = _ilike;
        this._in = _in;
        this._is_null = _is_null;
        this._like = _like;
        this._lt = _lt;
        this._lte = _lte;
        this._neq = _neq;
        this._nilike = _nilike;
        this._nin = _nin;
        this._nlike = _nlike;
        this._nsimilar = _nsimilar;
        this._similar = _similar;
    }

    public String get_eq() {
        return _eq;
    }
    public void set_eq(String _eq) {
        this._eq = _eq;
    }

    public String get_gt() {
        return _gt;
    }
    public void set_gt(String _gt) {
        this._gt = _gt;
    }

    public String get_gte() {
        return _gte;
    }
    public void set_gte(String _gte) {
        this._gte = _gte;
    }

    public String get_ilike() {
        return _ilike;
    }
    public void set_ilike(String _ilike) {
        this._ilike = _ilike;
    }

    public java.util.List<String> get_in() {
        return _in;
    }
    public void set_in(java.util.List<String> _in) {
        this._in = _in;
    }

    public Boolean get_is_null() {
        return _is_null;
    }
    public void set_is_null(Boolean _is_null) {
        this._is_null = _is_null;
    }

    public String get_like() {
        return _like;
    }
    public void set_like(String _like) {
        this._like = _like;
    }

    public String get_lt() {
        return _lt;
    }
    public void set_lt(String _lt) {
        this._lt = _lt;
    }

    public String get_lte() {
        return _lte;
    }
    public void set_lte(String _lte) {
        this._lte = _lte;
    }

    public String get_neq() {
        return _neq;
    }
    public void set_neq(String _neq) {
        this._neq = _neq;
    }

    public String get_nilike() {
        return _nilike;
    }
    public void set_nilike(String _nilike) {
        this._nilike = _nilike;
    }

    public java.util.List<String> get_nin() {
        return _nin;
    }
    public void set_nin(java.util.List<String> _nin) {
        this._nin = _nin;
    }

    public String get_nlike() {
        return _nlike;
    }
    public void set_nlike(String _nlike) {
        this._nlike = _nlike;
    }

    public String get_nsimilar() {
        return _nsimilar;
    }
    public void set_nsimilar(String _nsimilar) {
        this._nsimilar = _nsimilar;
    }

    public String get_similar() {
        return _similar;
    }
    public void set_similar(String _similar) {
        this._similar = _similar;
    }



    public static String_comparison_exp.Builder builder() {
        return new String_comparison_exp.Builder();
    }

    public static class Builder {

        private String _eq;
        private String _gt;
        private String _gte;
        private String _ilike;
        private java.util.List<String> _in;
        private Boolean _is_null;
        private String _like;
        private String _lt;
        private String _lte;
        private String _neq;
        private String _nilike;
        private java.util.List<String> _nin;
        private String _nlike;
        private String _nsimilar;
        private String _similar;

        public Builder() {
        }

        public Builder set_eq(String _eq) {
            this._eq = _eq;
            return this;
        }

        public Builder set_gt(String _gt) {
            this._gt = _gt;
            return this;
        }

        public Builder set_gte(String _gte) {
            this._gte = _gte;
            return this;
        }

        public Builder set_ilike(String _ilike) {
            this._ilike = _ilike;
            return this;
        }

        public Builder set_in(java.util.List<String> _in) {
            this._in = _in;
            return this;
        }

        public Builder set_is_null(Boolean _is_null) {
            this._is_null = _is_null;
            return this;
        }

        public Builder set_like(String _like) {
            this._like = _like;
            return this;
        }

        public Builder set_lt(String _lt) {
            this._lt = _lt;
            return this;
        }

        public Builder set_lte(String _lte) {
            this._lte = _lte;
            return this;
        }

        public Builder set_neq(String _neq) {
            this._neq = _neq;
            return this;
        }

        public Builder set_nilike(String _nilike) {
            this._nilike = _nilike;
            return this;
        }

        public Builder set_nin(java.util.List<String> _nin) {
            this._nin = _nin;
            return this;
        }

        public Builder set_nlike(String _nlike) {
            this._nlike = _nlike;
            return this;
        }

        public Builder set_nsimilar(String _nsimilar) {
            this._nsimilar = _nsimilar;
            return this;
        }

        public Builder set_similar(String _similar) {
            this._similar = _similar;
            return this;
        }


        public String_comparison_exp build() {
            return new String_comparison_exp(_eq, _gt, _gte, _ilike, _in, _is_null, _like, _lt, _lte, _neq, _nilike, _nin, _nlike, _nsimilar, _similar);
        }

    }
}
