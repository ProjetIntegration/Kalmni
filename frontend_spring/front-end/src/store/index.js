import { defineStore } from 'pinia';
import { ref, computed } from 'vue'; // Import computed from the 'vue' package

export const useAuthStore = defineStore('auth', () => {
    const token = ref(localStorage.getItem('token') ?? null);
    const isAuth = ref(!!localStorage.getItem('token') && !!localStorage.getItem('user'));
    const user = ref(JSON.parse(localStorage.getItem('user')) ?? null);
    const role = ref(localStorage.getItem('role') ?? null);

    const getToken = computed(() => token.value);
    const getIsAuth = computed(() => isAuth.value);
    const getUser = computed(() => user.value);
    const getIsAdmin = computed(() => role.value === 'admin'); // Adjust based on your role logic

    function login(t, u, r) {
        token.value = t;
        isAuth.value = true;
        role.value = r;
        user.value = u;

        localStorage.setItem('token', t);
        localStorage.setItem('role', r);
        localStorage.setItem('user', JSON.stringify(u));
    }

    function logout() {
        token.value = null;
        isAuth.value = false;
        role.value = null;
        user.value = null;

        localStorage.removeItem('token');
        localStorage.removeItem('role');
        localStorage.removeItem('user');
    }

    function setUser(u) {
        user.value = u;
        localStorage.setItem('user', JSON.stringify(u));
    }

    return {
        token,
        user,
        isAuth,
        role,
        login,
        setUser,
        logout,
        getToken,
        getIsAuth,
        getUser,
        getIsAdmin,
    };
});
